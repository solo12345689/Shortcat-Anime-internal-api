.class final LN/a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a;->h(La1/U;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:La1/U;

.field final synthetic b:LN/a;

.field final synthetic c:La1/t;

.field final synthetic d:Lkotlin/jvm/functions/Function1;

.field final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(La1/U;LN/a;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/a$a;->a:La1/U;

    .line 2
    .line 3
    iput-object p2, p0, LN/a$a;->b:LN/a;

    .line 4
    .line 5
    iput-object p3, p0, LN/a$a;->c:La1/t;

    .line 6
    .line 7
    iput-object p4, p0, LN/a$a;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p5, p0, LN/a$a;->e:Lkotlin/jvm/functions/Function1;

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
.method public final a(LN/s0;)V
    .locals 6

    .line 1
    iget-object v1, p0, LN/a$a;->a:La1/U;

    .line 2
    .line 3
    iget-object v0, p0, LN/a$a;->b:LN/a;

    .line 4
    .line 5
    invoke-virtual {v0}, LN/q0;->i()LN/q0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, p0, LN/a$a;->c:La1/t;

    .line 10
    .line 11
    iget-object v4, p0, LN/a$a;->d:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v5, p0, LN/a$a;->e:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    invoke-virtual/range {v0 .. v5}, LN/s0;->l(La1/U;LN/q0$a;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LN/s0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LN/a$a;->a(LN/s0;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
