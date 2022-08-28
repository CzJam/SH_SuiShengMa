package com.jamcz.startanything

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.ShortcutInfo
import android.content.pm.ShortcutManager
import android.graphics.drawable.Icon
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        startActivity(Intent(Intent.ACTION_MAIN).setClassName("com.android.settings","com.android.settings.MainSettings"))
        startActivity(Intent().setData(Uri.parse("alipays://platformapi/startapp?appId=2019072665939857&page=pages%2Fmy-station-type%2Fmy-station-type")))

        finishAffinity()

//    val shortcutManager = getSystemService(ShortcutManager::class.java)
//    val shortcut = ShortcutInfo.Builder(applicationContext, "ID1")
//        .setShortLabel("设置")
//        .setIcon(Icon.createWithResource(applicationContext, R.drawable.ic_baseline_settings_24))
//        .setIntent(Intent(Intent.ACTION_VIEW, null, this, SettingAct::class.java))
//        .build()
//    shortcutManager!!.dynamicShortcuts = listOf(shortcut)

}

}
