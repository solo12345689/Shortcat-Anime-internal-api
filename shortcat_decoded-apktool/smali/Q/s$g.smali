.class final LQ/s$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/s;->j(LE0/b;LK/J;LE0/q;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/J;


# direct methods
.method constructor <init>(LK/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/s$g;->a:LK/J;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LE0/C;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ/s$g;->a:LK/J;

    .line 2
    .line 3
    invoke-static {p1}, LE0/r;->g(LE0/C;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-interface {v0, v1, v2}, LK/J;->e(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, LE0/C;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LE0/C;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQ/s$g;->a(LE0/C;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
