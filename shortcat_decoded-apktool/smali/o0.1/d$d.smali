.class public final Lo0/d$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/d;->v0(Lo0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lo0/d;

.field final synthetic c:Lo0/b;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/N;Lo0/d;Lo0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/d$d;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iput-object p2, p0, Lo0/d$d;->b:Lo0/d;

    .line 4
    .line 5
    iput-object p3, p0, Lo0/d$d;->c:Lo0/b;

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
.method public final a(LK0/I0;)LK0/H0;
    .locals 3

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lo0/d;

    .line 3
    .line 4
    iget-object v1, p0, Lo0/d$d;->b:Lo0/d;

    .line 5
    .line 6
    invoke-static {v1}, Lo0/d;->F1(Lo0/d;)Lo0/c;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1, v0}, Lo0/c;->a(Lo0/f;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lo0/d$d;->c:Lo0/b;

    .line 17
    .line 18
    invoke-static {v1}, Lo0/h;->a(Lo0/b;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v0, v1, v2}, Lo0/e;->a(Lo0/d;J)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lo0/d$d;->a:Lkotlin/jvm/internal/N;

    .line 29
    .line 30
    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object p1, LK0/H0;->c:LK0/H0;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object p1, LK0/H0;->a:LK0/H0;

    .line 36
    .line 37
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LK0/I0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo0/d$d;->a(LK0/I0;)LK0/H0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
