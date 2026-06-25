.class public final synthetic LE3/B4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/M4;

.field public final synthetic b:LE3/T6;

.field public final synthetic c:I

.field public final synthetic d:LF3/q$b;

.field public final synthetic e:LE3/M4$i;


# direct methods
.method public synthetic constructor <init>(LE3/M4;LE3/T6;ILF3/q$b;LE3/M4$i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/B4;->a:LE3/M4;

    .line 5
    .line 6
    iput-object p2, p0, LE3/B4;->b:LE3/T6;

    .line 7
    .line 8
    iput p3, p0, LE3/B4;->c:I

    .line 9
    .line 10
    iput-object p4, p0, LE3/B4;->d:LF3/q$b;

    .line 11
    .line 12
    iput-object p5, p0, LE3/B4;->e:LE3/M4$i;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/B4;->a:LE3/M4;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B4;->b:LE3/T6;

    .line 4
    .line 5
    iget v2, p0, LE3/B4;->c:I

    .line 6
    .line 7
    iget-object v3, p0, LE3/B4;->d:LF3/q$b;

    .line 8
    .line 9
    iget-object v4, p0, LE3/B4;->e:LE3/M4$i;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, LE3/M4;->a0(LE3/M4;LE3/T6;ILF3/q$b;LE3/M4$i;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
