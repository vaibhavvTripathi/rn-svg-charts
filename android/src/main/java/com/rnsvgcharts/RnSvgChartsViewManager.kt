package com.rnsvgcharts

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.RnSvgChartsViewManagerInterface
import com.facebook.react.viewmanagers.RnSvgChartsViewManagerDelegate

@ReactModule(name = RnSvgChartsViewManager.NAME)
class RnSvgChartsViewManager : SimpleViewManager<RnSvgChartsView>(),
  RnSvgChartsViewManagerInterface<RnSvgChartsView> {
  private val mDelegate: ViewManagerDelegate<RnSvgChartsView>

  init {
    mDelegate = RnSvgChartsViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<RnSvgChartsView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): RnSvgChartsView {
    return RnSvgChartsView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: RnSvgChartsView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "RnSvgChartsView"
  }
}
