.class final LK/A$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/A;->d(LE0/L;LK/J;LZd/e;)Ljava/lang/Object;
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
    iput-object p1, p0, LK/A$e;->a:LK/J;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LE0/C;J)V
    .locals 0

    .line 1
    iget-object p1, p0, LK/A$e;->a:LK/J;

    .line 2
    .line 3
    invoke-interface {p1, p2, p3}, LK/J;->e(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LE0/C;

    .line 2
    .line 3
    check-cast p2, Lr0/f;

    .line 4
    .line 5
    invoke-virtual {p2}, Lr0/f;->u()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, p1, v0, v1}, LK/A$e;->a(LE0/C;J)V

    .line 10
    .line 11
    .line 12
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method
