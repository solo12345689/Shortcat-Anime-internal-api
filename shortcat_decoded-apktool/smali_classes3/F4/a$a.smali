.class final LF4/a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF4/a;-><init>(Ltg/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF4/a;


# direct methods
.method constructor <init>(LF4/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF4/a$a;->a:LF4/a;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()Ldg/d;
    .locals 2

    .line 1
    sget-object v0, Ldg/d;->n:Ldg/d$b;

    .line 2
    .line 3
    iget-object v1, p0, LF4/a$a;->a:LF4/a;

    .line 4
    .line 5
    invoke-virtual {v1}, LF4/a;->d()Ldg/t;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ldg/d$b;->b(Ldg/t;)Ldg/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF4/a$a;->a()Ldg/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
