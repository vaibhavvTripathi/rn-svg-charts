#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface RnSvgChartsViewManager : RCTViewManager
@end

@implementation RnSvgChartsViewManager

RCT_EXPORT_MODULE(RnSvgChartsView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
