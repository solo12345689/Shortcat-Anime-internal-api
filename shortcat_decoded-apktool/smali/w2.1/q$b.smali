.class public final Lw2/q$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw2/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lw2/y;

.field private b:Lw2/F;

.field private c:LO9/o;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Z

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw2/y;

    .line 5
    .line 6
    invoke-direct {v0}, Lw2/y;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw2/q$b;->a:Lw2/y;

    .line 10
    .line 11
    const/16 v0, 0x1f40

    .line 12
    .line 13
    iput v0, p0, Lw2/q$b;->e:I

    .line 14
    .line 15
    iput v0, p0, Lw2/q$b;->f:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lw2/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw2/q$b;->b()Lw2/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Lw2/q;
    .locals 10

    .line 1
    new-instance v0, Lw2/q;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/q$b;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lw2/q$b;->e:I

    .line 6
    .line 7
    iget v3, p0, Lw2/q$b;->f:I

    .line 8
    .line 9
    iget-boolean v4, p0, Lw2/q$b;->g:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lw2/q$b;->h:Z

    .line 12
    .line 13
    iget-object v6, p0, Lw2/q$b;->a:Lw2/y;

    .line 14
    .line 15
    iget-object v7, p0, Lw2/q$b;->c:LO9/o;

    .line 16
    .line 17
    iget-boolean v8, p0, Lw2/q$b;->i:Z

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    invoke-direct/range {v0 .. v9}, Lw2/q;-><init>(Ljava/lang/String;IIZZLw2/y;LO9/o;ZLw2/q$a;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lw2/q$b;->b:Lw2/F;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lw2/b;->i(Lw2/F;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object v0
.end method

.method public c(Ljava/lang/String;)Lw2/q$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lw2/q$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
