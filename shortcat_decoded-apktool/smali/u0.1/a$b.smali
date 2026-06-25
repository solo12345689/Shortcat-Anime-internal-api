.class public final Lu0/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lu0/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu0/a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lu0/h;

.field private b:Lv0/c;

.field final synthetic c:Lu0/a;


# direct methods
.method constructor <init>(Lu0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lu0/b;->a(Lu0/d;)Lu0/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lu0/a$b;->a:Lu0/h;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Lu0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->a:Lu0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ls0/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lu0/a$a;->e()Ls0/j0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public c(Li1/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lu0/a$a;->j(Li1/d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Li1/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lu0/a$a;->k(Li1/t;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lu0/a$a;->l(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lu0/a$a;->h()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public g()Lv0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->b:Lv0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDensity()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lu0/a$a;->f()Li1/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lu0/a$a;->g()Li1/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public h(Ls0/j0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/a$b;->c:Lu0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lu0/a$a;->i(Ls0/j0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(Lv0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/a$b;->b:Lv0/c;

    .line 2
    .line 3
    return-void
.end method
