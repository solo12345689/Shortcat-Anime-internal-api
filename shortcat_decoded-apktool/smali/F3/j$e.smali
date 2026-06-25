.class public final LF3/j$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:I

.field private final b:LF3/a;

.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method constructor <init>(ILF3/a;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LF3/j$e;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LF3/j$e;->b:LF3/a;

    .line 7
    .line 8
    iput p3, p0, LF3/j$e;->c:I

    .line 9
    .line 10
    iput p4, p0, LF3/j$e;->d:I

    .line 11
    .line 12
    iput p5, p0, LF3/j$e;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()LF3/a;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/j$e;->b:LF3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LF3/j$e;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, LF3/j$e;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LF3/j$e;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, LF3/j$e;->c:I

    .line 2
    .line 3
    return v0
.end method
