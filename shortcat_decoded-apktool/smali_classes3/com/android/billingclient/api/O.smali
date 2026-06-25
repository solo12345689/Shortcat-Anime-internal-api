.class public final synthetic Lcom/android/billingclient/api/O;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/T;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lcom/android/billingclient/api/d;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/T;Landroid/app/Activity;Lcom/android/billingclient/api/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/O;->a:Lcom/android/billingclient/api/T;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/O;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/O;->c:Lcom/android/billingclient/api/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/O;->a:Lcom/android/billingclient/api/T;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/billingclient/api/O;->b:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/billingclient/api/O;->c:Lcom/android/billingclient/api/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/T;->e1(Lcom/android/billingclient/api/T;Landroid/app/Activity;Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
