package com.kotlin.myunittesting

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito.*

class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var cudboidModel: CudboidModel

    private var dummyLength = 12.0
    private var dummyWidth = 7.0
    private var dummyHeight = 6.0

    private val dummyVolume = 504.0
    private val dummyCircumference = 100.0
    private val dummySurfaceArea = 396.0

    @Before
    fun before() {
        cudboidModel= mock(CudboidModel::class.java)
        mainViewModel = MainViewModel(cudboidModel)
    }

    @Test
    fun testVolume(){
        cudboidModel = CudboidModel()
        mainViewModel = MainViewModel(cudboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.getVolume()
        assertEquals(dummyVolume, volume, 0.0001)
    }

    @Test
    fun getCircumference() {
        cudboidModel = CudboidModel()
        mainViewModel = MainViewModel(cudboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.getCircumference()
        assertEquals(dummyCircumference, volume, 0.0001)
    }

    @Test
    fun getsurfaceArea() {
        cudboidModel = CudboidModel()
        mainViewModel = MainViewModel(cudboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.getsurfaceArea()
        assertEquals(dummySurfaceArea, volume, 0.0001)
    }

    @Test
    fun testMockVolume() {
        `when`(mainViewModel.getVolume()).thenReturn(dummyVolume)
        val volume = mainViewModel.getVolume()
        verify(cudboidModel).getVolume()
        assertEquals(dummyVolume, volume, 0.0001)
    }

    @Test
    fun testMockCircumference() {
        `when`(mainViewModel.getCircumference()).thenReturn(dummyCircumference)
        val circumference = mainViewModel.getCircumference()
        verify(cudboidModel).getGetCircumference()
        assertEquals(dummyCircumference, circumference, 0.0001)
    }

    @Test
    fun testMockSurfaceArea() {
        `when`(mainViewModel.getsurfaceArea()).thenReturn(dummySurfaceArea)
        val surfaceArea = mainViewModel.getsurfaceArea()
        verify(cudboidModel).getSurfaceArea()
        assertEquals(dummySurfaceArea, surfaceArea, 0.0001)
    }
}