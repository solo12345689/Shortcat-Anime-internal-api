.class public final Led/i$v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/i;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Led/i;


# direct methods
.method public constructor <init>(Led/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Led/i$v;->a:Led/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Led/i$v;->a:Led/i;

    .line 2
    .line 3
    new-instance v1, Led/b;

    .line 4
    .line 5
    iget-object v2, p0, Led/i$v;->a:Led/i;

    .line 6
    .line 7
    invoke-virtual {v2}, Led/i;->N()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Led/i$v;->a:Led/i;

    .line 12
    .line 13
    invoke-virtual {v3}, Lgc/c;->i()LUb/d;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, LUb/d;->v()Lpb/b;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {v1, v2, v3}, Led/b;-><init>(Landroid/content/Context;Lpb/b;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Led/i;->C(Led/i;Led/b;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Led/i$v;->a:Led/i;

    .line 28
    .line 29
    new-instance v1, Lfd/b;

    .line 30
    .line 31
    iget-object v2, p0, Led/i$v;->a:Led/i;

    .line 32
    .line 33
    invoke-virtual {v2}, Led/i;->N()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Led/i$v;->a:Led/i;

    .line 38
    .line 39
    invoke-static {v3}, Led/i;->A(Led/i;)Lfd/a;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {v1, v2, v3}, Lfd/b;-><init>(Landroid/content/Context;Lfd/a;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Led/i;->D(Led/i;Lfd/b;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "AndroidKeyStore"

    .line 50
    .line 51
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-virtual {v0, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Led/i$v;->a:Led/i;

    .line 60
    .line 61
    invoke-static {v1, v0}, Led/i;->F(Led/i;Ljava/security/KeyStore;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Led/i$v;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
