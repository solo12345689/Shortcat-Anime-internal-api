.class public Lcom/facebook/react/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Landroid/app/Application;

.field private b:Lcom/facebook/react/N;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/j;-><init>(Landroid/app/Application;Lz7/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lz7/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    .line 3
    iput-object p2, p0, Lcom/facebook/react/j;->b:Lcom/facebook/react/N;

    .line 4
    iput-object p1, p0, Lcom/facebook/react/j;->a:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 27

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lz7/r;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Lz7/r;-><init>(Lz7/a;)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lio/invertase/notifee/NotifeePackage;

    .line 10
    .line 11
    invoke-direct {v2}, Lio/invertase/notifee/NotifeePackage;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v3, Lio/invertase/firebase/analytics/l;

    .line 15
    .line 16
    invoke-direct {v3}, Lio/invertase/firebase/analytics/l;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v4, Lio/invertase/firebase/app/b;

    .line 20
    .line 21
    invoke-direct {v4}, Lio/invertase/firebase/app/b;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v5, Lio/invertase/firebase/messaging/t;

    .line 25
    .line 26
    invoke-direct {v5}, Lio/invertase/firebase/messaging/t;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v6, Lcom/reactnativegooglesignin/m;

    .line 30
    .line 31
    invoke-direct {v6}, Lcom/reactnativegooglesignin/m;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v7, Lorg/reactnative/maskedview/b;

    .line 35
    .line 36
    invoke-direct {v7}, Lorg/reactnative/maskedview/b;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v8, Lio/sentry/react/r;

    .line 40
    .line 41
    invoke-direct {v8}, Lio/sentry/react/r;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v9, Lcom/shopify/reactnative/skia/g;

    .line 45
    .line 46
    invoke-direct {v9}, Lcom/shopify/reactnative/skia/g;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v10, Lib/c;

    .line 50
    .line 51
    invoke-direct {v10}, Lib/c;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v11, LM4/a;

    .line 55
    .line 56
    invoke-direct {v11}, LM4/a;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v12, LPa/e;

    .line 60
    .line 61
    invoke-direct {v12}, LPa/e;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v13, Lcom/reactnativekeyboardcontroller/b;

    .line 65
    .line 66
    invoke-direct {v13}, Lcom/reactnativekeyboardcontroller/b;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v14, Lcom/margelo/nitro/mmkv/c;

    .line 70
    .line 71
    invoke-direct {v14}, Lcom/margelo/nitro/mmkv/c;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v15, Lya/c;

    .line 75
    .line 76
    invoke-direct {v15}, Lya/c;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v16, Lgb/f;

    .line 80
    .line 81
    invoke-direct/range {v16 .. v16}, Lgb/f;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v17, Lcom/revenuecat/purchases/react/RNPurchasesPackage;

    .line 85
    .line 86
    invoke-direct/range {v17 .. v17}, Lcom/revenuecat/purchases/react/RNPurchasesPackage;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v18, Lcom/revenuecat/purchases/react/ui/RevenueCatUIPackage;

    .line 90
    .line 91
    invoke-direct/range {v18 .. v18}, Lcom/revenuecat/purchases/react/ui/RevenueCatUIPackage;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v19, Lcom/swmansion/reanimated/ReanimatedPackage;

    .line 95
    .line 96
    invoke-direct/range {v19 .. v19}, Lcom/swmansion/reanimated/ReanimatedPackage;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance v20, Lcom/th3rdwave/safeareacontext/e;

    .line 100
    .line 101
    invoke-direct/range {v20 .. v20}, Lcom/th3rdwave/safeareacontext/e;-><init>()V

    .line 102
    .line 103
    .line 104
    new-instance v21, Lcom/swmansion/rnscreens/t;

    .line 105
    .line 106
    invoke-direct/range {v21 .. v21}, Lcom/swmansion/rnscreens/t;-><init>()V

    .line 107
    .line 108
    .line 109
    new-instance v22, Lcom/horcrux/svg/SvgPackage;

    .line 110
    .line 111
    invoke-direct/range {v22 .. v22}, Lcom/horcrux/svg/SvgPackage;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance v23, Lcom/swmansion/worklets/WorkletsPackage;

    .line 115
    .line 116
    invoke-direct/range {v23 .. v23}, Lcom/swmansion/worklets/WorkletsPackage;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance v24, Lcom/oblador/performance/f;

    .line 120
    .line 121
    invoke-direct/range {v24 .. v24}, Lcom/oblador/performance/f;-><init>()V

    .line 122
    .line 123
    .line 124
    move-object/from16 v25, v1

    .line 125
    .line 126
    const/16 v1, 0x18

    .line 127
    .line 128
    new-array v1, v1, [Lcom/facebook/react/O;

    .line 129
    .line 130
    const/16 v26, 0x0

    .line 131
    .line 132
    aput-object v25, v1, v26

    .line 133
    .line 134
    const/16 v25, 0x1

    .line 135
    .line 136
    aput-object v2, v1, v25

    .line 137
    .line 138
    const/4 v2, 0x2

    .line 139
    aput-object v3, v1, v2

    .line 140
    .line 141
    const/4 v2, 0x3

    .line 142
    aput-object v4, v1, v2

    .line 143
    .line 144
    const/4 v2, 0x4

    .line 145
    aput-object v5, v1, v2

    .line 146
    .line 147
    const/4 v2, 0x5

    .line 148
    aput-object v6, v1, v2

    .line 149
    .line 150
    const/4 v2, 0x6

    .line 151
    aput-object v7, v1, v2

    .line 152
    .line 153
    const/4 v2, 0x7

    .line 154
    aput-object v8, v1, v2

    .line 155
    .line 156
    const/16 v2, 0x8

    .line 157
    .line 158
    aput-object v9, v1, v2

    .line 159
    .line 160
    const/16 v2, 0x9

    .line 161
    .line 162
    aput-object v10, v1, v2

    .line 163
    .line 164
    const/16 v2, 0xa

    .line 165
    .line 166
    aput-object v11, v1, v2

    .line 167
    .line 168
    const/16 v2, 0xb

    .line 169
    .line 170
    aput-object v12, v1, v2

    .line 171
    .line 172
    const/16 v2, 0xc

    .line 173
    .line 174
    aput-object v13, v1, v2

    .line 175
    .line 176
    const/16 v2, 0xd

    .line 177
    .line 178
    aput-object v14, v1, v2

    .line 179
    .line 180
    const/16 v2, 0xe

    .line 181
    .line 182
    aput-object v15, v1, v2

    .line 183
    .line 184
    const/16 v2, 0xf

    .line 185
    .line 186
    aput-object v16, v1, v2

    .line 187
    .line 188
    const/16 v2, 0x10

    .line 189
    .line 190
    aput-object v17, v1, v2

    .line 191
    .line 192
    const/16 v2, 0x11

    .line 193
    .line 194
    aput-object v18, v1, v2

    .line 195
    .line 196
    const/16 v2, 0x12

    .line 197
    .line 198
    aput-object v19, v1, v2

    .line 199
    .line 200
    const/16 v2, 0x13

    .line 201
    .line 202
    aput-object v20, v1, v2

    .line 203
    .line 204
    const/16 v2, 0x14

    .line 205
    .line 206
    aput-object v21, v1, v2

    .line 207
    .line 208
    const/16 v2, 0x15

    .line 209
    .line 210
    aput-object v22, v1, v2

    .line 211
    .line 212
    const/16 v2, 0x16

    .line 213
    .line 214
    aput-object v23, v1, v2

    .line 215
    .line 216
    const/16 v2, 0x17

    .line 217
    .line 218
    aput-object v24, v1, v2

    .line 219
    .line 220
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 225
    .line 226
    .line 227
    return-object v0
.end method
