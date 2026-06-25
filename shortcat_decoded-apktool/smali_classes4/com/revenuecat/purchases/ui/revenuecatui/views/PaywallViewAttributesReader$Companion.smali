.class public final Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;",
        "",
        "()V",
        "DEFAULT_CONDENSED",
        "",
        "styleablesByStyleSet",
        "",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;",
        "",
        "parseAttributes",
        "Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$PaywallViewAttributes;",
        "context",
        "Landroid/content/Context;",
        "attrsSet",
        "Landroid/util/AttributeSet;",
        "styleAttrs",
        "Attributes",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parseAttributes(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$PaywallViewAttributes;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "styleAttrs"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v1, Lkotlin/jvm/internal/N;

    .line 16
    .line 17
    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lkotlin/jvm/internal/N;

    .line 21
    .line 22
    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {p1, p2, p3, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    :try_start_0
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader;->access$getStyleablesByStyleSet$cp()Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    check-cast p3, Ljava/util/Map;

    .line 39
    .line 40
    if-nez p3, :cond_1

    .line 41
    .line 42
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 43
    .line 44
    const-string p3, "Styleable not found for PaywallView"

    .line 45
    .line 46
    invoke-virtual {p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    :try_start_1
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;->FontFamily:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;

    .line 57
    .line 58
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/Integer;

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    move-object v4, v0

    .line 80
    :goto_0
    iput-object v4, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 81
    .line 82
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;->OfferingId:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;

    .line 83
    .line 84
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/Integer;

    .line 89
    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move-object v4, v0

    .line 102
    :goto_1
    iput-object v4, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;->ShouldDisplayDismissButton:Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$Companion$Attributes;

    .line 105
    .line 106
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    check-cast p3, Ljava/lang/Integer;

    .line 111
    .line 112
    if-eqz p3, :cond_4

    .line 113
    .line 114
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    goto :goto_2

    .line 133
    :cond_4
    move-object p3, v0

    .line 134
    :goto_2
    sget v4, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallFooterView_condensed:I

    .line 135
    .line 136
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_5

    .line 141
    .line 142
    sget v4, Lcom/revenuecat/purchases/ui/revenuecatui/R$styleable;->PaywallFooterView_condensed:I

    .line 143
    .line 144
    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    goto :goto_3

    .line 153
    :cond_5
    move-object v3, v0

    .line 154
    :goto_3
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 155
    .line 156
    .line 157
    iget-object p2, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p2, Ljava/lang/Integer;

    .line 160
    .line 161
    if-eqz p2, :cond_8

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-lez v1, :cond_6

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_6
    move-object p2, v0

    .line 171
    :goto_4
    if-eqz p2, :cond_8

    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    invoke-static {p1, p2}, Lz1/k;->h(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-nez p1, :cond_7

    .line 182
    .line 183
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 184
    .line 185
    const-string p2, "Font given for PaywallView not found"

    .line 186
    .line 187
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_7
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;

    .line 192
    .line 193
    invoke-static {p1}, LY0/l;->a(Landroid/graphics/Typeface;)LY0/u;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;-><init>(LY0/u;)V

    .line 198
    .line 199
    .line 200
    :cond_8
    :goto_5
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$PaywallViewAttributes;

    .line 201
    .line 202
    iget-object p2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p2, Ljava/lang/String;

    .line 205
    .line 206
    invoke-direct {p1, p2, v0, p3, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/views/PaywallViewAttributesReader$PaywallViewAttributes;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 207
    .line 208
    .line 209
    return-object p1

    .line 210
    :goto_6
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 211
    .line 212
    .line 213
    throw p1
.end method
