.class public Lcom/amazon/device/drm/a/b/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/amazon/device/drm/a/c;


# static fields
.field private static final a:Ljava/lang/String; = "c"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public a(Lcom/amazon/device/drm/model/RequestId;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/amazon/device/drm/a/b/c;->a:Ljava/lang/String;

    const-string v1, "sendGetLicense"

    invoke-static {v0, v1}, Lcom/amazon/device/drm/a/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/amazon/device/drm/a/a/b;

    invoke-direct {v0, p1}, Lcom/amazon/device/drm/a/a/b;-><init>(Lcom/amazon/device/drm/model/RequestId;)V

    invoke-virtual {v0}, Lcom/amazon/device/drm/a/b/b;->e()V

    return-void
.end method
