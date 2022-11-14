package com.nadeem.zoomvideosdkgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import us.zoom.sdk.ZoomVideoSDK
import us.zoom.sdk.ZoomVideoSDKDelegate
import us.zoom.sdk.ZoomVideoSDKInitParams
import us.zoom.sdk.ZoomVideoSDKRawDataMemoryMode

const val domain = "https://zoom.us"
const val enableLog = true

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val params = ZoomVideoSDKInitParams()
        params.domain = domain
        params.enableLog = enableLog
        params.videoRawDataMemoryMode =
            ZoomVideoSDKRawDataMemoryMode.ZoomVideoSDKRawDataMemoryModeHeap
        params.audioRawDataMemoryMode =
            ZoomVideoSDKRawDataMemoryMode.ZoomVideoSDKRawDataMemoryModeHeap
        params.shareRawDataMemoryMode =
            ZoomVideoSDKRawDataMemoryMode.ZoomVideoSDKRawDataMemoryModeHeap

        ZoomVideoSDK.getInstance().initialize(this,params)

    }
}