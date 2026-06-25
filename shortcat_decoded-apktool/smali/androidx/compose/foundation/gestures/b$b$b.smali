.class final Landroidx/compose/foundation/gestures/b$b$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF0/d;

.field final synthetic b:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(LF0/d;Landroidx/compose/foundation/gestures/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$b;->a:LF0/d;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$b;->b:Landroidx/compose/foundation/gestures/b;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LE0/C;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$b;->a:LF0/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, LF0/e;->c(LF0/d;LE0/C;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$b;->b:Landroidx/compose/foundation/gestures/b;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->K1(Landroidx/compose/foundation/gestures/b;)LIf/g;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroidx/compose/foundation/gestures/a$b;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p2, p3, v1}, Landroidx/compose/foundation/gestures/a$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, LIf/k;->b(Ljava/lang/Object;)LIf/k;

    .line 25
    .line 26
    .line 27
    :cond_0
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
    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/gestures/b$b$b;->a(LE0/C;J)V

    .line 10
    .line 11
    .line 12
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method
