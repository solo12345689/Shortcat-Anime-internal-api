.class public final synthetic Lcom/android/billingclient/api/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/E;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/E;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/C;->a:Lcom/android/billingclient/api/E;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/C;->a:Lcom/android/billingclient/api/E;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/billingclient/api/E;->a(Lcom/android/billingclient/api/E;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method
