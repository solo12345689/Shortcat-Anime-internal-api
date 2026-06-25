.class public final Lzc/g$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc/g;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lzc/g;


# direct methods
.method public constructor <init>(Lzc/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzc/g$d;->a:Lzc/g;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lzc/g$d;->a:Lzc/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgc/c;->i()LUb/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lzc/g$d;->a:Lzc/g;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lzc/g;->C(Lzc/g;Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lzc/g$d;->a:Lzc/g;

    .line 19
    .line 20
    new-instance v1, Lzc/g$a;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lzc/g$a;-><init>(Lzc/g;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lzc/g;->B(Lzc/g;Lie/a;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lzc/i;->a:Lzc/i;

    .line 29
    .line 30
    iget-object v1, p0, Lzc/g$d;->a:Lzc/g;

    .line 31
    .line 32
    invoke-static {v1}, Lzc/g;->z(Lzc/g;)Lie/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lzc/i;->c(Lie/a;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzc/g$d;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
