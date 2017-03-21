//
//  NativeLog.m
//  aran_native_log
//
//  Created by aran.hu on 17/3/21.
//  Copyright © 2017年 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "NativeLog.h"

@implementation NativeLog

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(nativeLog: (NSString *)str)
{
  NSLog(@"IOS NATIVE LOG FRO == %@", str);
}

@end
