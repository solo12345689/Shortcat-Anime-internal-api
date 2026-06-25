.class public interface abstract Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u0000 #2\u00020\u0001:\u0001#J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J-\u0010\t\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J+\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H&\u00a2\u0006\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "",
        "",
        "getApplicationName",
        "()Ljava/lang/String;",
        "",
        "resId",
        "",
        "formatArgs",
        "getString",
        "(I[Ljava/lang/Object;)Ljava/lang/String;",
        "Ljava/util/Locale;",
        "getLocale",
        "()Ljava/util/Locale;",
        "name",
        "type",
        "getResourceIdentifier",
        "(Ljava/lang/String;Ljava/lang/String;)I",
        "resourceId",
        "LY0/u;",
        "getXmlFontFamily",
        "(I)LY0/u;",
        "",
        "names",
        "",
        "getAssetFontPaths",
        "(Ljava/util/List;)Ljava/util/Map;",
        "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;",
        "fontInfo",
        "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;",
        "getCachedFontFamilyOrStartDownload",
        "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;",
        "Landroid/content/res/AssetManager;",
        "getAssetManager",
        "()Landroid/content/res/AssetManager;",
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
.field public static final ASSETS_FONTS_DIR:Ljava/lang/String; = "fonts"

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider$Companion;->$$INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider$Companion;

    .line 2
    .line 3
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider$Companion;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public abstract getApplicationName()Ljava/lang/String;
.end method

.method public abstract getAssetFontPaths(Ljava/util/List;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAssetManager()Landroid/content/res/AssetManager;
.end method

.method public abstract getCachedFontFamilyOrStartDownload(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;
.end method

.method public abstract getLocale()Ljava/util/Locale;
.end method

.method public abstract getResourceIdentifier(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public varargs abstract getString(I[Ljava/lang/Object;)Ljava/lang/String;
.end method

.method public abstract getXmlFontFamily(I)LY0/u;
.end method
