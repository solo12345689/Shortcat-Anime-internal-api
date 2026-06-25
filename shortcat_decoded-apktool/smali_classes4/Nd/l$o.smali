.class public final LNd/l$o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNd/l;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LNd/l;


# direct methods
.method public constructor <init>(LNd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LNd/l$o;->a:LNd/l;

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
    iget-object v0, p0, LNd/l$o;->a:LNd/l;

    .line 2
    .line 3
    new-instance v1, LNd/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lgc/c;->i()LUb/d;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, LNd/a;-><init>(LUb/d;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LNd/l;->G(LNd/a;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LNd/l$o;->a:LNd/l;

    .line 16
    .line 17
    new-instance v1, LNd/f;

    .line 18
    .line 19
    invoke-static {v0}, LNd/l;->y(LNd/l;)Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, v2}, LNd/f;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, LNd/l;->F(LNd/f;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LNd/l$o;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
