.class public final synthetic Lcom/revenuecat/purchases/google/usecase/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LN4/k;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;

.field public final synthetic c:Ljava/util/Set;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/Date;

.field public final synthetic f:LN4/k;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;Ljava/util/Set;Ljava/lang/String;Ljava/util/Date;LN4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/google/usecase/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/google/usecase/d;->b:Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/revenuecat/purchases/google/usecase/d;->c:Ljava/util/Set;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/revenuecat/purchases/google/usecase/d;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/revenuecat/purchases/google/usecase/d;->e:Ljava/util/Date;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/revenuecat/purchases/google/usecase/d;->f:LN4/k;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/j;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/google/usecase/d;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/google/usecase/d;->b:Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/google/usecase/d;->c:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/google/usecase/d;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/revenuecat/purchases/google/usecase/d;->e:Ljava/util/Date;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/revenuecat/purchases/google/usecase/d;->f:LN4/k;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    move-object v7, p2

    .line 15
    invoke-static/range {v0 .. v7}, Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;Ljava/util/Set;Ljava/lang/String;Ljava/util/Date;LN4/k;Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/j;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
