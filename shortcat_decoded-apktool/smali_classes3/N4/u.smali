.class public final synthetic LN4/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK1/a;


# instance fields
.field public final synthetic a:LN4/g;

.field public final synthetic b:LN4/f;


# direct methods
.method public synthetic constructor <init>(LN4/g;LN4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN4/u;->a:LN4/g;

    .line 5
    .line 6
    iput-object p2, p0, LN4/u;->b:LN4/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN4/u;->a:LN4/g;

    .line 2
    .line 3
    iget-object v1, p0, LN4/u;->b:LN4/f;

    .line 4
    .line 5
    check-cast p1, Lcom/android/billingclient/api/e;

    .line 6
    .line 7
    invoke-virtual {v1}, LN4/f;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, p1, v1}, LN4/g;->a(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
