.class public final Ld6/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lf6/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld6/f;-><init>(Ljava/lang/String;La6/d;Lb6/c;Lf6/k;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:Ld6/f;


# direct methods
.method constructor <init>(Ld6/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld6/f$a;->b:Ld6/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ld6/f;->i(Ld6/f;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Ld6/f$a;->a:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/f$a;->b:Ld6/f;

    .line 2
    .line 3
    invoke-static {v0}, Ld6/f;->g(Ld6/f;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld6/f$a;->b:Ld6/f;

    .line 2
    .line 3
    invoke-static {v0}, Ld6/f;->g(Ld6/f;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ld6/f$a;->b:Ld6/f;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v0}, Ld6/f;->i(Ld6/f;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {p1, v1, v2}, Loe/j;->m(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {v0, p1}, Ld6/f;->j(Ld6/f;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Ld6/f$a;->b:Ld6/f;

    .line 24
    .line 25
    invoke-static {p1}, Ld6/f;->h(Ld6/f;)Lf6/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Ld6/f$a;->b:Ld6/f;

    .line 32
    .line 33
    invoke-static {v0}, Ld6/f;->g(Ld6/f;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-interface {p1, v0}, Lf6/j;->d(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Ld6/f$a;->a:I

    .line 2
    .line 3
    return v0
.end method
