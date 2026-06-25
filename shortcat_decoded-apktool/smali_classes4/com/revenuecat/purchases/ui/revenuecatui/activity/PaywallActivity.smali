.class public final Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;
.super Landroidx/activity/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0016H\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;",
        "Landroidx/activity/j;",
        "<init>",
        "()V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;",
        "getArgs",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;",
        "getFontProvider",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;",
        "Lcom/revenuecat/purchases/Offering;",
        "exitOffering",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;",
        "result",
        "LTd/L;",
        "onDismissRequest",
        "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V",
        "launchExitOfferActivity",
        "(Lcom/revenuecat/purchases/Offering;)V",
        "Landroid/content/Intent;",
        "createResultIntent",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "outState",
        "onSaveInstanceState",
        "Lg/d;",
        "exitOfferLauncher",
        "Lg/d;",
        "Companion",
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


# static fields
.field public static final $stable:I

.field public static final ARGS_EXTRA:Ljava/lang/String; = "paywall_args"

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$Companion;

.field public static final RESULT_EXTRA:Ljava/lang/String; = "paywall_result"


# instance fields
.field private final exitOfferLauncher:Lg/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/activity/j;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallContract;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallContract;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/b;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/b;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Landroidx/activity/j;->registerForActivityResult(Lh/a;Lg/b;)Lg/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->exitOfferLauncher:Lg/d;

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic access$createResultIntent(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->createResultIntent(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getFontProvider(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->getFontProvider()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$onDismissRequest(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->onDismissRequest(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final createResultIntent(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "paywall_result"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "Intent().putExtra(RESULT_EXTRA, result)"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method private static final exitOfferLauncher$lambda$0(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->createResultIntent(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final getArgs()Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const-string v2, "paywall_args"

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 14
    .line 15
    invoke-static {v0, v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/a;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 31
    .line 32
    return-object v0
.end method

.method private final getFontProvider()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;
    .locals 15

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->getArgs()Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_8

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getFonts()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_8

    .line 18
    .line 19
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-static {v4}, LUd/S;->e(I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;->getFonts()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    new-instance v6, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v7, 0xa

    .line 75
    .line 76
    invoke-static {v4, v7}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_5

    .line 92
    .line 93
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;

    .line 98
    .line 99
    instance-of v8, v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;

    .line 100
    .line 101
    if-eqz v8, :cond_0

    .line 102
    .line 103
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;

    .line 104
    .line 105
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->getResourceId()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->getFontWeight()LY0/L;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->getFontStyle()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    invoke-static {v7}, LY0/H;->d(I)I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    const/16 v12, 0x8

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v11, 0x0

    .line 125
    invoke-static/range {v8 .. v13}, LY0/B;->b(ILY0/L;IIILjava/lang/Object;)LY0/t;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    goto :goto_2

    .line 130
    :cond_0
    instance-of v8, v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;

    .line 131
    .line 132
    if-eqz v8, :cond_1

    .line 133
    .line 134
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;

    .line 135
    .line 136
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;->getPath()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    const-string v10, "assets"

    .line 145
    .line 146
    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;->getFontWeight()LY0/L;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;->getFontStyle()I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    invoke-static {v7}, LY0/H;->d(I)I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    const/16 v13, 0x10

    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    const/4 v12, 0x0

    .line 165
    invoke-static/range {v8 .. v14}, LY0/d;->d(Ljava/lang/String;Landroid/content/res/AssetManager;LY0/L;ILY0/K$d;ILjava/lang/Object;)LY0/t;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    goto :goto_2

    .line 170
    :cond_1
    instance-of v8, v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;

    .line 171
    .line 172
    if-eqz v8, :cond_3

    .line 173
    .line 174
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;

    .line 175
    .line 176
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->getFontProvider()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    if-nez v9, :cond_2

    .line 185
    .line 186
    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;->toGoogleProvider()LZ0/c$a;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    invoke-interface {v0, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    :cond_2
    check-cast v9, LZ0/c$a;

    .line 194
    .line 195
    new-instance v8, LZ0/c;

    .line 196
    .line 197
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->getFontName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    const/4 v11, 0x0

    .line 202
    const/4 v12, 0x2

    .line 203
    invoke-direct {v8, v10, v11, v12, v2}, LZ0/c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->getFontWeight()LY0/L;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->getFontStyle()I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    invoke-static {v7}, LY0/H;->d(I)I

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    invoke-static {v8, v9, v10, v7}, LZ0/e;->a(LZ0/c;LZ0/c$a;LY0/L;I)LY0/t;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    :goto_2
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :cond_3
    new-instance v0, LTd/r;

    .line 228
    .line 229
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :cond_4
    move-object v6, v2

    .line 234
    :cond_5
    if-eqz v6, :cond_6

    .line 235
    .line 236
    invoke-static {v6}, LY0/v;->b(Ljava/util/List;)LY0/u;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    goto :goto_3

    .line 241
    :cond_6
    move-object v4, v2

    .line 242
    :goto_3
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_7
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$getFontProvider$1;

    .line 248
    .line 249
    invoke-direct {v0, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$getFontProvider$1;-><init>(Ljava/util/Map;)V

    .line 250
    .line 251
    .line 252
    return-object v0

    .line 253
    :cond_8
    return-object v2
.end method

.method private final launchExitOfferActivity(Lcom/revenuecat/purchases/Offering;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->getArgs()Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Offering;->getIdentifier()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v2, p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V

    .line 19
    .line 20
    .line 21
    const/16 v9, 0xfd

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    invoke-static/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;Ljava/util/Map;ZZZLjava/util/Map;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->exitOfferLauncher:Lg/d;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lg/d;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final onDismissRequest(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-direct {p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->createResultIntent(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p0, v0, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->launchExitOfferActivity(Lcom/revenuecat/purchases/Offering;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic x(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->exitOfferLauncher$lambda$0(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 3
    .line 4
    .line 5
    invoke-super {p0, p1}, Landroidx/activity/j;->onCreate(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationStateKt;->restoreSdkConfigurationIfNeeded(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->getArgs()Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/4 p1, 0x0

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getWasLaunchedThroughSDK()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, p1

    .line 24
    :goto_0
    if-nez v1, :cond_1

    .line 25
    .line 26
    sget-object v1, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/revenuecat/purchases/Purchases$Companion;->isConfigured()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 35
    .line 36
    const-string v0, "PaywallActivity was launched incorrectly. Please use PaywallActivityLauncher, or Paywall/PaywallDialog/PaywallFooter composables to display the Paywall."

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const/4 v7, 0x0

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getNonSerializableArgsKey()Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgsStore;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgsStore;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgsStore;->get(I)Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgs;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v1, v7

    .line 66
    :goto_1
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getNonSerializableArgsKey()Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move-object v2, v7

    .line 74
    :goto_2
    if-eqz v2, :cond_4

    .line 75
    .line 76
    if-nez v1, :cond_4

    .line 77
    .line 78
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 79
    .line 80
    const-string v0, "PaywallActivity was recreated after process death causing PurchaseLogic and/or PaywallListener to be lost. Finishing activity."

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Cancelled;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult$Cancelled;

    .line 86
    .line 87
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;->createResultIntent(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const/4 v0, -0x1

    .line 92
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    if-eqz v1, :cond_5

    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgs;->getListener()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    move-object v2, v7

    .line 107
    :goto_3
    if-eqz v1, :cond_6

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityNonSerializableArgs;->getPurchaseLogic()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v6, v1

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    move-object v6, v7

    .line 116
    :goto_4
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$compositeListener$1;

    .line 117
    .line 118
    invoke-direct {v5, v2, p0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$compositeListener$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;)V

    .line 119
    .line 120
    .line 121
    if-eqz v4, :cond_7

    .line 122
    .line 123
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getEdgeToEdge()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-ne v1, v0, :cond_7

    .line 128
    .line 129
    move p1, v0

    .line 130
    :cond_7
    if-eqz p1, :cond_8

    .line 131
    .line 132
    const/4 p1, 0x3

    .line 133
    invoke-static {p0, v7, v7, p1, v7}, Landroidx/activity/s;->b(Landroidx/activity/j;Landroidx/activity/M;Landroidx/activity/M;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_8
    if-eqz v4, :cond_9

    .line 137
    .line 138
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;->getOfferingIdAndPresentedOfferingContext()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    move-object v2, p1

    .line 143
    goto :goto_5

    .line 144
    :cond_9
    move-object v2, v7

    .line 145
    :goto_5
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1;

    .line 146
    .line 147
    move-object v3, p0

    .line 148
    invoke-direct/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity$onCreate$compositeListener$1;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)V

    .line 149
    .line 150
    .line 151
    const p1, 0x792120a4

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v0, v1}, Lg0/i;->b(IZLjava/lang/Object;)Lg0/b;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p0, v7, p1, v0, v7}, Le/b;->b(Landroidx/activity/j;LY/y;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "outState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/SdkConfigurationStateKt;->saveSdkConfiguration(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroidx/activity/j;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
