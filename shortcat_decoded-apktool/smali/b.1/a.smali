.class public interface abstract Lb/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a$b;,
        Lb/a$a;
    }
.end annotation


# static fields
.field public static final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    const/16 v1, 0x2e

    .line 4
    .line 5
    const-string v2, "android$support$customtabs$ICustomTabsCallback"

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lb/a;->m:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public abstract A2(Landroid/os/Bundle;)V
.end method

.method public abstract I2(IILandroid/os/Bundle;)V
.end method

.method public abstract U0(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract Y2(ILandroid/os/Bundle;)V
.end method

.method public abstract a0(IIIIILandroid/os/Bundle;)V
.end method

.method public abstract c1(Landroid/os/Bundle;)V
.end method

.method public abstract m0(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

.method public abstract n3(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract t3(Landroid/os/Bundle;)V
.end method

.method public abstract w3(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end method

.method public abstract x2(Landroid/os/Bundle;)V
.end method
