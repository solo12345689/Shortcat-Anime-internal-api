.class public final synthetic Lcom/android/billingclient/api/g0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/android/billingclient/api/d;

.field public final synthetic f:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/g0;->a:Lcom/android/billingclient/api/b;

    .line 5
    .line 6
    iput p2, p0, Lcom/android/billingclient/api/g0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/g0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/android/billingclient/api/g0;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/android/billingclient/api/g0;->e:Lcom/android/billingclient/api/d;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/android/billingclient/api/g0;->f:Landroid/os/Bundle;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/g0;->a:Lcom/android/billingclient/api/b;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/billingclient/api/g0;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/billingclient/api/g0;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/android/billingclient/api/g0;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/android/billingclient/api/g0;->e:Lcom/android/billingclient/api/d;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/android/billingclient/api/g0;->f:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->B0(Lcom/android/billingclient/api/b;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/d;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
