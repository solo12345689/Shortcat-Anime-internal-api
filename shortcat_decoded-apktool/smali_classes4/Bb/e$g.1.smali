.class public final LBb/e$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBb/e;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LBb/e;


# direct methods
.method public constructor <init>(LBb/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBb/e$g;->a:LBb/e;

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
    .locals 3

    .line 1
    iget-object v0, p0, LBb/e$g;->a:LBb/e;

    .line 2
    .line 3
    invoke-static {v0}, LBb/e;->D(LBb/e;)Lv7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ldg/w;

    .line 8
    .line 9
    iget-object v2, p0, LBb/e$g;->a:LBb/e;

    .line 10
    .line 11
    invoke-static {v2}, LBb/e;->C(LBb/e;)Lv7/d;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2}, Ldg/w;-><init>(Ljava/net/CookieHandler;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lv7/a;->a(Ldg/n;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBb/e$g;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
