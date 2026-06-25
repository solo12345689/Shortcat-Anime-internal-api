.class public final synthetic Lcom/android/billingclient/api/J;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/T;

.field public final synthetic b:Lcom/android/billingclient/api/i;

.field public final synthetic c:LN4/k;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/T;Lcom/android/billingclient/api/i;LN4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/J;->a:Lcom/android/billingclient/api/T;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/J;->b:Lcom/android/billingclient/api/i;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/J;->c:LN4/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/J;->a:Lcom/android/billingclient/api/T;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/billingclient/api/J;->b:Lcom/android/billingclient/api/i;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/billingclient/api/J;->c:LN4/k;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/T;->h1(Lcom/android/billingclient/api/T;Lcom/android/billingclient/api/i;LN4/k;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
