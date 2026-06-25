.class public final LY/c1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final i:I = 0x8


# instance fields
.field private final a:LY/D;

.field private final b:Z

.field private final c:LY/T1;

.field private final d:LY/C0;

.field private final e:Lkotlin/jvm/functions/Function1;

.field private final f:Z

.field private final g:Ljava/lang/Object;

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/D;Ljava/lang/Object;ZLY/T1;LY/C0;Lkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/c1;->a:LY/D;

    .line 5
    .line 6
    iput-boolean p3, p0, LY/c1;->b:Z

    .line 7
    .line 8
    iput-object p4, p0, LY/c1;->c:LY/T1;

    .line 9
    .line 10
    iput-object p5, p0, LY/c1;->d:LY/C0;

    .line 11
    .line 12
    iput-object p6, p0, LY/c1;->e:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iput-boolean p7, p0, LY/c1;->f:Z

    .line 15
    .line 16
    iput-object p2, p0, LY/c1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, LY/c1;->h:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/c1;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()LY/D;
    .locals 1

    .line 1
    iget-object v0, p0, LY/c1;->a:LY/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/c1;->e:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/c1;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, p0, LY/c1;->d:LY/C0;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_1
    iget-object v0, p0, LY/c1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_2
    const-string v0, "Unexpected form of a provided value"

    .line 22
    .line 23
    invoke-static {v0}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 24
    .line 25
    .line 26
    new-instance v0, LTd/k;

    .line 27
    .line 28
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public final e()LY/T1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/c1;->c:LY/T1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LY/c1;->d:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY/c1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LY/c1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LY/c1;->h:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/c1;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/c1;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LY/c1;->g()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, LY/c1;->f:Z

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    return v0
.end method
