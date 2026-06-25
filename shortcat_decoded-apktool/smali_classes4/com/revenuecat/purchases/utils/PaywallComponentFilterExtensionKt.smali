.class public final Lcom/revenuecat/purchases/utils/PaywallComponentFilterExtensionKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a&\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "filter",
        "",
        "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;",
        "predicate",
        "Lkotlin/Function1;",
        "",
        "purchases_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final filter(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "predicate"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, LUd/m;

    .line 17
    .line 18
    invoke-direct {v1}, LUd/m;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_10

    .line 29
    .line 30
    invoke-virtual {v1}, LUd/m;->removeFirst()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;

    .line 35
    .line 36
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/StackComponent;->getComponents()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v1, p0}, LUd/m;->addAll(Ljava/util/Collection;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v1, p0}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {v1, p0}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/PackageComponent;

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/PackageComponent;

    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/PackageComponent;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {v1, p0}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;

    .line 108
    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {v1, p0}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_6
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;

    .line 122
    .line 123
    if-eqz v2, :cond_7

    .line 124
    .line 125
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;

    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;->getPages()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {v1, p0}, LUd/m;->addAll(Ljava/util/Collection;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_7
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;

    .line 136
    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;

    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v1, p0}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_8
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/TabsComponent;

    .line 150
    .line 151
    if-eqz v2, :cond_c

    .line 152
    .line 153
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/TabsComponent;

    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/TabsComponent;->getControl()Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    instance-of v3, v2, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;

    .line 160
    .line 161
    if-eqz v3, :cond_9

    .line 162
    .line 163
    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;

    .line 164
    .line 165
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v1, v2}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_9
    instance-of v3, v2, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;

    .line 174
    .line 175
    if-eqz v3, :cond_a

    .line 176
    .line 177
    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;

    .line 178
    .line 179
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v1, v2}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_a
    :goto_1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/TabsComponent;->getTabs()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance v2, Ljava/util/ArrayList;

    .line 191
    .line 192
    const/16 v3, 0xa

    .line 193
    .line 194
    invoke-static {p0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 199
    .line 200
    .line 201
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_b

    .line 210
    .line 211
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;

    .line 216
    .line 217
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_b
    invoke-virtual {v1, v2}, LUd/m;->addAll(Ljava/util/Collection;)Z

    .line 226
    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_c
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;

    .line 231
    .line 232
    if-eqz v2, :cond_e

    .line 233
    .line 234
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;

    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;->getItems()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    new-instance v2, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_d

    .line 254
    .line 255
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;

    .line 260
    .line 261
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;->getTitle()Lcom/revenuecat/purchases/paywalls/components/TextComponent;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;->getDescription()Lcom/revenuecat/purchases/paywalls/components/TextComponent;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;->getIcon()Lcom/revenuecat/purchases/paywalls/components/IconComponent;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    const/4 v6, 0x3

    .line 274
    new-array v6, v6, [Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;

    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    aput-object v4, v6, v7

    .line 278
    .line 279
    const/4 v4, 0x1

    .line 280
    aput-object v5, v6, v4

    .line 281
    .line 282
    const/4 v4, 0x2

    .line 283
    aput-object v3, v6, v4

    .line 284
    .line 285
    invoke-static {v6}, LUd/u;->r([Ljava/lang/Object;)Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v2, v3}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_d
    invoke-virtual {v1, v2}, LUd/m;->addAll(Ljava/util/Collection;)Z

    .line 294
    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :cond_e
    instance-of v2, p0, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;

    .line 299
    .line 300
    if-eqz v2, :cond_0

    .line 301
    .line 302
    check-cast p0, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;

    .line 303
    .line 304
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;->getCountdownStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v1, v2}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;->getEndStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    if-eqz v2, :cond_f

    .line 316
    .line 317
    invoke-virtual {v1, v2}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    :cond_f
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;->getFallback()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    if-eqz p0, :cond_0

    .line 325
    .line 326
    invoke-virtual {v1, p0}, LUd/m;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto/16 :goto_0

    .line 330
    .line 331
    :cond_10
    return-object v0
.end method
