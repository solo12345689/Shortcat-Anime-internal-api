.class final Lw/m0$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/m0;->c(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:F

.field final synthetic c:Lw/d;

.field final synthetic d:Lw/k;

.field final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;FLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/m0$f;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iput p2, p0, Lw/m0$f;->b:F

    .line 4
    .line 5
    iput-object p3, p0, Lw/m0$f;->c:Lw/d;

    .line 6
    .line 7
    iput-object p4, p0, Lw/m0$f;->d:Lw/k;

    .line 8
    .line 9
    iput-object p5, p0, Lw/m0$f;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    .line 1
    iget-object v0, p0, Lw/m0$f;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lw/h;

    .line 10
    .line 11
    iget v4, p0, Lw/m0$f;->b:F

    .line 12
    .line 13
    iget-object v5, p0, Lw/m0$f;->c:Lw/d;

    .line 14
    .line 15
    iget-object v6, p0, Lw/m0$f;->d:Lw/k;

    .line 16
    .line 17
    iget-object v7, p0, Lw/m0$f;->e:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    move-wide v2, p1

    .line 20
    invoke-static/range {v1 .. v7}, Lw/m0;->a(Lw/h;JFLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Lw/m0$f;->a(J)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method
