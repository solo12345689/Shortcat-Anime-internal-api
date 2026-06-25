.class public final Lcom/revenuecat/purchases/react/ui/FontAssetManager;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JE\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c\"\u0004\u0008\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/FontAssetManager;",
        "",
        "<init>",
        "()V",
        "T",
        "",
        "fontFamilyName",
        "Landroid/content/res/AssetManager;",
        "assetManager",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;",
        "createFont",
        "",
        "getFontsInFamily",
        "(Ljava/lang/String;Landroid/content/res/AssetManager;Lkotlin/jvm/functions/Function2;)Ljava/util/List;",
        "LY0/u;",
        "getFontFamily",
        "(Ljava/lang/String;Landroid/content/res/AssetManager;)LY0/u;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;",
        "getPaywallFontFamily",
        "(Ljava/lang/String;Landroid/content/res/AssetManager;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;",
        "",
        "fontFamilyCache",
        "Ljava/util/Map;",
        "paywallFontFamilyCache",
        "",
        "FILE_EXTENSIONS",
        "[Ljava/lang/String;",
        "FONT_PATH",
        "Ljava/lang/String;",
        "FontStyleExtension",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final FILE_EXTENSIONS:[Ljava/lang/String;

.field private static final FONT_PATH:Ljava/lang/String; = "fonts/"

.field public static final INSTANCE:Lcom/revenuecat/purchases/react/ui/FontAssetManager;

.field private static fontFamilyCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "LY0/u;",
            ">;"
        }
    .end annotation
.end field

.field private static paywallFontFamilyCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/react/ui/FontAssetManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->INSTANCE:Lcom/revenuecat/purchases/react/ui/FontAssetManager;

    .line 7
    .line 8
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->fontFamilyCache:Ljava/util/Map;

    .line 13
    .line 14
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->paywallFontFamilyCache:Ljava/util/Map;

    .line 19
    .line 20
    const-string v0, ".ttf"

    .line 21
    .line 22
    const-string v1, ".otf"

    .line 23
    .line 24
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->FILE_EXTENSIONS:[Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroid/content/res/AssetManager;Ljava/lang/String;Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;)LY0/t;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->getFontFamily$lambda$0(Landroid/content/res/AssetManager;Ljava/lang/String;Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;)LY0/t;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getFILE_EXTENSIONS$p()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->FILE_EXTENSIONS:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->getPaywallFontFamily$lambda$1(Ljava/lang/String;Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final getFontFamily$lambda$0(Landroid/content/res/AssetManager;Ljava/lang/String;Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;)LY0/t;
    .locals 9

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "styleExtension"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "fonts/"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p2}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->getWeight()LY0/L;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {p2}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->getStyle-_-LCdwA()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/16 v7, 0x10

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    move-object v3, p0

    .line 41
    invoke-static/range {v2 .. v8}, LY0/d;->d(Ljava/lang/String;Landroid/content/res/AssetManager;LY0/L;ILY0/K$d;ILjava/lang/Object;)LY0/t;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method private final getFontsInFamily(Ljava/lang/String;Landroid/content/res/AssetManager;Lkotlin/jvm/functions/Function2;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Landroid/content/res/AssetManager;",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "fonts/"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, LUd/n;->V0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->values()[Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    array-length v2, v1

    .line 29
    const/4 v3, 0x0

    .line 30
    move v4, v3

    .line 31
    :goto_0
    if-ge v4, v2, :cond_4

    .line 32
    .line 33
    aget-object v5, v1, v4

    .line 34
    .line 35
    sget-object v6, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->FILE_EXTENSIONS:[Ljava/lang/String;

    .line 36
    .line 37
    array-length v7, v6

    .line 38
    move v8, v3

    .line 39
    :goto_1
    if-ge v8, v7, :cond_3

    .line 40
    .line 41
    aget-object v9, v6, v8

    .line 42
    .line 43
    invoke-virtual {v5}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->getExtension()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    new-instance v11, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-interface {p2, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_2

    .line 70
    .line 71
    invoke-interface {p3, v9, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    return-object v0
.end method

.method private static final getPaywallFontFamily$lambda$1(Ljava/lang/String;Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;
    .locals 3

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "styleExtension"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "fonts/"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->getWeight()LY0/L;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p1}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->getStyle-_-LCdwA()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-direct {v0, p0, v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$AssetFont;-><init>(Ljava/lang/String;LY0/L;I)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method


# virtual methods
.method public final declared-synchronized getFontFamily(Ljava/lang/String;Landroid/content/res/AssetManager;)LY0/u;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "fontFamilyName"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "assetManager"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->fontFamilyCache:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LY0/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object v0

    .line 24
    :cond_0
    :try_start_1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/e;

    .line 25
    .line 26
    invoke-direct {v0, p2}, Lcom/revenuecat/purchases/react/ui/e;-><init>(Landroid/content/res/AssetManager;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1, p2, v0}, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->getFontsInFamily(Ljava/lang/String;Landroid/content/res/AssetManager;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, LY0/v;->b(Ljava/util/List;)LY0/u;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    sget-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->fontFamilyCache:Ljava/util/Map;

    .line 44
    .line 45
    invoke-static {p1, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v0, p1}, LUd/S;->q(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sput-object p1, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->fontFamilyCache:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 p2, 0x0

    .line 59
    :goto_0
    monitor-exit p0

    .line 60
    return-object p2

    .line 61
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    throw p1
.end method

.method public final declared-synchronized getPaywallFontFamily(Ljava/lang/String;Landroid/content/res/AssetManager;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "fontFamilyName"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "assetManager"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->paywallFontFamilyCache:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object v0

    .line 24
    :cond_0
    :try_start_1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/f;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/revenuecat/purchases/react/ui/f;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1, p2, v0}, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->getFontsInFamily(Ljava/lang/String;Landroid/content/res/AssetManager;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;

    .line 40
    .line 41
    invoke-direct {v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;-><init>(Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    sget-object p2, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->paywallFontFamilyCache:Ljava/util/Map;

    .line 45
    .line 46
    invoke-static {p1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p2, p1}, LUd/S;->q(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sput-object p1, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->paywallFontFamilyCache:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/4 v0, 0x0

    .line 60
    :goto_0
    monitor-exit p0

    .line 61
    return-object v0

    .line 62
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw p1
.end method
