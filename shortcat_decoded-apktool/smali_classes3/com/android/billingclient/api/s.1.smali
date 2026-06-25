.class public final synthetic Lcom/android/billingclient/api/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:LN4/g;

.field public final synthetic c:LN4/f;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;LN4/g;LN4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/s;->a:Lcom/android/billingclient/api/b;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/s;->b:LN4/g;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/s;->c:LN4/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/s;->a:Lcom/android/billingclient/api/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/billingclient/api/s;->b:LN4/g;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/billingclient/api/s;->c:LN4/f;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/b;->p(Lcom/android/billingclient/api/b;LN4/g;LN4/f;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
