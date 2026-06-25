.class public final synthetic LE3/j4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/M4;

.field public final synthetic b:I

.field public final synthetic c:LF3/q$b;

.field public final synthetic d:LE3/M4$i;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(LE3/M4;ILF3/q$b;LE3/M4$i;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/j4;->a:LE3/M4;

    .line 5
    .line 6
    iput p2, p0, LE3/j4;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LE3/j4;->c:LF3/q$b;

    .line 9
    .line 10
    iput-object p4, p0, LE3/j4;->d:LE3/M4$i;

    .line 11
    .line 12
    iput-boolean p5, p0, LE3/j4;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/j4;->a:LE3/M4;

    .line 2
    .line 3
    iget v1, p0, LE3/j4;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LE3/j4;->c:LF3/q$b;

    .line 6
    .line 7
    iget-object v3, p0, LE3/j4;->d:LE3/M4$i;

    .line 8
    .line 9
    iget-boolean v4, p0, LE3/j4;->e:Z

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, LE3/M4;->f0(LE3/M4;ILF3/q$b;LE3/M4$i;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
