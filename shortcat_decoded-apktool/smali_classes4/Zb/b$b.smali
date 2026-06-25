.class public final LZb/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZb/b;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LZb/b;


# direct methods
.method public constructor <init>(LZb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZb/b$b;->a:LZb/b;

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
    new-instance v0, LZb/b$a;

    .line 2
    .line 3
    iget-object v1, p0, LZb/b$b;->a:LZb/b;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LZb/b$a;-><init>(LZb/b;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LZb/b$b;->a:LZb/b;

    .line 9
    .line 10
    new-instance v2, Lub/d;

    .line 11
    .line 12
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {v2, v0}, Lub/d;-><init>(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, LZb/b;->y(LZb/b;Lub/d;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZb/b$b;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
