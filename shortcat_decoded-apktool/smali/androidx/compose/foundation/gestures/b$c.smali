.class final Landroidx/compose/foundation/gestures/b$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b;->Z1(LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/gestures/b;

.field d:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$c;->c:Landroidx/compose/foundation/gestures/b;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(LZd/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/foundation/gestures/b$c;->d:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/foundation/gestures/b$c;->d:I

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$c;->c:Landroidx/compose/foundation/gestures/b;

    .line 11
    .line 12
    invoke-static {p1, p0}, Landroidx/compose/foundation/gestures/b;->N1(Landroidx/compose/foundation/gestures/b;LZd/e;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
