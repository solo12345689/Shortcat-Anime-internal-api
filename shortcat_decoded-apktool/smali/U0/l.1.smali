.class public final synthetic LU0/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:[F

.field public final synthetic c:Lkotlin/jvm/internal/L;

.field public final synthetic d:Lkotlin/jvm/internal/K;


# direct methods
.method public synthetic constructor <init>(J[FLkotlin/jvm/internal/L;Lkotlin/jvm/internal/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LU0/l;->a:J

    .line 5
    .line 6
    iput-object p3, p0, LU0/l;->b:[F

    .line 7
    .line 8
    iput-object p4, p0, LU0/l;->c:Lkotlin/jvm/internal/L;

    .line 9
    .line 10
    iput-object p5, p0, LU0/l;->d:Lkotlin/jvm/internal/K;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-wide v0, p0, LU0/l;->a:J

    .line 2
    .line 3
    iget-object v2, p0, LU0/l;->b:[F

    .line 4
    .line 5
    iget-object v3, p0, LU0/l;->c:Lkotlin/jvm/internal/L;

    .line 6
    .line 7
    iget-object v4, p0, LU0/l;->d:Lkotlin/jvm/internal/K;

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    check-cast v5, LU0/w;

    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, LU0/n;->a(J[FLkotlin/jvm/internal/L;Lkotlin/jvm/internal/K;LU0/w;)LTd/L;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
