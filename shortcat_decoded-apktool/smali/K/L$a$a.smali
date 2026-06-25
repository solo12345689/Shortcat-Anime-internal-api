.class final LK/L$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/L$a;->i(La1/W;La1/U;La1/l;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:La1/l;

.field final synthetic b:Lkotlin/jvm/functions/Function1;

.field final synthetic c:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(La1/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/L$a$a;->a:La1/l;

    .line 2
    .line 3
    iput-object p2, p0, LK/L$a$a;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, LK/L$a$a;->c:Lkotlin/jvm/internal/N;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LK/L$a$a;->invoke(Ljava/util/List;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 4

    .line 2
    sget-object v0, LK/L;->a:LK/L$a;

    iget-object v1, p0, LK/L$a$a;->a:La1/l;

    iget-object v2, p0, LK/L$a$a;->b:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, LK/L$a$a;->c:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, La1/c0;

    invoke-virtual {v0, p1, v1, v2, v3}, LK/L$a;->g(Ljava/util/List;La1/l;Lkotlin/jvm/functions/Function1;La1/c0;)V

    return-void
.end method
