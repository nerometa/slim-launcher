package com.sduduzog.slimlauncher.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.sduduzog.slimlauncher.data.BaseDao
import com.sduduzog.slimlauncher.data.model.App
import javax.inject.Inject

class MainViewModel @Inject constructor(baseDao: BaseDao) : ViewModel() {

    private val _baseRepository = Repository(baseDao)

    private var _apps: LiveData<List<HomeApp>> = _baseRepository.apps

    val apps: LiveData<List<HomeApp>>
        get() = _apps
}