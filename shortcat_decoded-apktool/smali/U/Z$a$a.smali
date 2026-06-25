.class final LU/Z$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/Z$a;->a(Lkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/W;


# direct methods
.method constructor <init>(LU/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/Z$a$a;->a:LU/W;

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LR0/C;

    invoke-virtual {p0, p1}, LU/Z$a$a;->invoke(LR0/C;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LR0/C;)V
    .locals 3

    .line 2
    sget-object v0, LR0/e;->b:LR0/e$a;

    invoke-virtual {v0}, LR0/e$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LR0/A;->Z(LR0/C;I)V

    .line 3
    new-instance v0, LU/Z$a$a$a;

    iget-object v1, p0, LU/Z$a$a;->a:LU/W;

    invoke-direct {v0, v1}, LU/Z$a$a$a;-><init>(LU/W;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, LR0/A;->j(LR0/C;Ljava/lang/String;Lie/a;ILjava/lang/Object;)V

    return-void
.end method
