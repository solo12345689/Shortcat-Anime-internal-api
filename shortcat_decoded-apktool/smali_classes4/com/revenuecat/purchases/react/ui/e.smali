.class public final synthetic Lcom/revenuecat/purchases/react/ui/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroid/content/res/AssetManager;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/AssetManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/e;->a:Landroid/content/res/AssetManager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/e;->a:Landroid/content/res/AssetManager;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    check-cast p2, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lcom/revenuecat/purchases/react/ui/FontAssetManager;->a(Landroid/content/res/AssetManager;Ljava/lang/String;Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;)LY0/t;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
