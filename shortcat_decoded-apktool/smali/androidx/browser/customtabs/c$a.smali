.class Landroidx/browser/customtabs/c$a;
.super Lb/a$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/browser/customtabs/c;->b(Landroidx/browser/customtabs/b;)Lb/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field final synthetic b:Landroidx/browser/customtabs/c;


# direct methods
.method constructor <init>(Landroidx/browser/customtabs/c;Landroidx/browser/customtabs/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/browser/customtabs/c$a;->b:Landroidx/browser/customtabs/c;

    .line 2
    .line 3
    invoke-direct {p0}, Lb/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroidx/browser/customtabs/c$a;->a:Landroid/os/Handler;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public A2(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public I2(IILandroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public U0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public Y2(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public a0(IIIIILandroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c1(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m0(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public n3(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public t3(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public w3(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public x2(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method
