.class public final synthetic Lcom/android/billingclient/api/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:LN4/b;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;LN4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/billingclient/api/m;->a:Lcom/android/billingclient/api/b;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/m;->b:LN4/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/m;->a:Lcom/android/billingclient/api/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/billingclient/api/m;->b:LN4/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/android/billingclient/api/b;->s(Lcom/android/billingclient/api/b;LN4/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
