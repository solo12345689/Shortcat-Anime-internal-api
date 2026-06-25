.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParametersProvider;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh1/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh1/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParametersProvider;",
        "Lh1/a;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;",
        "<init>",
        "()V",
        "LCf/i;",
        "values",
        "LCf/i;",
        "getValues",
        "()LCf/i;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final values:LCf/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCf/i;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 5
    .line 6
    new-instance v3, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 7
    .line 8
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 9
    .line 10
    const/16 v6, 0xc8

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    invoke-direct {v1, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 17
    .line 18
    invoke-direct {v2, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, v1, v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 22
    .line 23
    .line 24
    sget-object v12, Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;->FILL:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const/16 v2, 0x64

    .line 30
    .line 31
    move-object v4, v12

    .line 32
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 36
    .line 37
    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 38
    .line 39
    new-instance v3, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 40
    .line 41
    invoke-direct {v3, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 45
    .line 46
    invoke-direct {v4, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v3, v4}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 50
    .line 51
    .line 52
    sget-object v17, Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;->FIT:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 53
    .line 54
    const/16 v18, 0x0

    .line 55
    .line 56
    const/16 v14, 0x64

    .line 57
    .line 58
    const/16 v15, 0x64

    .line 59
    .line 60
    move-object v13, v1

    .line 61
    move-object/from16 v16, v2

    .line 62
    .line 63
    invoke-direct/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 67
    .line 68
    new-instance v11, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 69
    .line 70
    new-instance v3, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 71
    .line 72
    invoke-direct {v3, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 76
    .line 77
    const/16 v5, 0x32

    .line 78
    .line 79
    invoke-direct {v4, v5, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v11, v3, v4}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 83
    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    const/16 v9, 0x64

    .line 87
    .line 88
    const/16 v10, 0x64

    .line 89
    .line 90
    move-object v8, v2

    .line 91
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 92
    .line 93
    .line 94
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 95
    .line 96
    new-instance v4, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 97
    .line 98
    new-instance v8, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 99
    .line 100
    invoke-direct {v8, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    new-instance v9, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 104
    .line 105
    invoke-direct {v9, v5, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v4, v8, v9}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 109
    .line 110
    .line 111
    move-object v13, v3

    .line 112
    move-object/from16 v16, v4

    .line 113
    .line 114
    invoke-direct/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    .line 116
    .line 117
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 118
    .line 119
    new-instance v11, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 120
    .line 121
    new-instance v8, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 122
    .line 123
    invoke-direct {v8, v5, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 124
    .line 125
    .line 126
    new-instance v9, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 127
    .line 128
    invoke-direct {v9, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v11, v8, v9}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 132
    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const/16 v9, 0x64

    .line 136
    .line 137
    move-object v8, v4

    .line 138
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 139
    .line 140
    .line 141
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 142
    .line 143
    new-instance v8, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 144
    .line 145
    new-instance v9, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 146
    .line 147
    invoke-direct {v9, v5, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 148
    .line 149
    .line 150
    new-instance v5, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 151
    .line 152
    invoke-direct {v5, v6, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v8, v9, v5}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 156
    .line 157
    .line 158
    move-object/from16 v16, v8

    .line 159
    .line 160
    invoke-direct/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 161
    .line 162
    .line 163
    move-object v5, v13

    .line 164
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 165
    .line 166
    new-instance v11, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 167
    .line 168
    new-instance v8, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 169
    .line 170
    const/16 v14, 0x48

    .line 171
    .line 172
    invoke-direct {v8, v14, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 173
    .line 174
    .line 175
    sget-object v15, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 176
    .line 177
    invoke-direct {v11, v8, v15}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 178
    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/16 v9, 0x64

    .line 182
    .line 183
    move-object v8, v6

    .line 184
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 185
    .line 186
    .line 187
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 188
    .line 189
    new-instance v11, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 190
    .line 191
    new-instance v9, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 192
    .line 193
    invoke-direct {v9, v14, v7}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 194
    .line 195
    .line 196
    invoke-direct {v11, v15, v9}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 197
    .line 198
    .line 199
    const/16 v9, 0x64

    .line 200
    .line 201
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 202
    .line 203
    .line 204
    move-object v7, v8

    .line 205
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 206
    .line 207
    new-instance v9, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 208
    .line 209
    sget-object v10, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 210
    .line 211
    invoke-direct {v9, v10, v15}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 212
    .line 213
    .line 214
    const/16 v14, 0x775

    .line 215
    .line 216
    move-object v11, v15

    .line 217
    const/16 v15, 0x51a

    .line 218
    .line 219
    move-object v13, v8

    .line 220
    move-object/from16 v16, v9

    .line 221
    .line 222
    invoke-direct/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 223
    .line 224
    .line 225
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 226
    .line 227
    new-instance v12, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 228
    .line 229
    invoke-direct {v12, v11, v10}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 230
    .line 231
    .line 232
    const/16 v14, 0x51a

    .line 233
    .line 234
    const/16 v15, 0x775

    .line 235
    .line 236
    move-object v13, v9

    .line 237
    move-object/from16 v16, v12

    .line 238
    .line 239
    invoke-direct/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;-><init>(IILcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 240
    .line 241
    .line 242
    filled-new-array/range {v0 .. v9}, [Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, LCf/l;->s([Ljava/lang/Object;)LCf/i;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    move-object/from16 v1, p0

    .line 251
    .line 252
    iput-object v0, v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParametersProvider;->values:LCf/i;

    .line 253
    .line 254
    return-void
.end method


# virtual methods
.method public bridge synthetic getCount()I
    .locals 1

    .line 1
    invoke-super {p0}, Lh1/a;->getCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getValues()LCf/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LCf/i;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParametersProvider;->values:LCf/i;

    .line 2
    .line 3
    return-object v0
.end method
