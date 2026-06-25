.class final Landroidx/compose/foundation/gestures/c$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/k;

.field final synthetic b:Landroidx/compose/foundation/gestures/c;


# direct methods
.method constructor <init>(Lz/k;Landroidx/compose/foundation/gestures/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/c$a$a;->a:Lz/k;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/c$a$a;->b:Landroidx/compose/foundation/gestures/c;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/gestures/a$b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/c$a$a;->a:Lz/k;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/c$a$a;->b:Landroidx/compose/foundation/gestures/c;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$b;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/gestures/c;->j2(Landroidx/compose/foundation/gestures/c;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object p1, p0, Landroidx/compose/foundation/gestures/c$a$a;->b:Landroidx/compose/foundation/gestures/c;

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/compose/foundation/gestures/c;->h2(Landroidx/compose/foundation/gestures/c;)Lz/q;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {v1, v2, p1}, Lz/l;->d(JLz/q;)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-interface {v0, p1}, Lz/k;->a(F)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/gestures/a$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/c$a$a;->a(Landroidx/compose/foundation/gestures/a$b;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
