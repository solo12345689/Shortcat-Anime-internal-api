.class public final LA4/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA4/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA4/c$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/nio/ByteBuffer;

.field private final b:LG4/m;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;LG4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA4/c;->a:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput-object p2, p0, LA4/c;->b:LG4/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    new-instance v0, Ltg/h;

    .line 3
    .line 4
    invoke-direct {v0}, Ltg/h;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LA4/c;->a:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ltg/h;->write(Ljava/nio/ByteBuffer;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LA4/c;->a:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    new-instance p1, LA4/m;

    .line 18
    .line 19
    iget-object v1, p0, LA4/c;->b:LG4/m;

    .line 20
    .line 21
    invoke-virtual {v1}, LG4/m;->g()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lx4/q;->a(Ltg/j;Landroid/content/Context;)Lx4/p;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    sget-object v2, Lx4/f;->b:Lx4/f;

    .line 31
    .line 32
    invoke-direct {p1, v0, v1, v2}, LA4/m;-><init>(Lx4/p;Ljava/lang/String;Lx4/f;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    iget-object v1, p0, LA4/c;->a:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 40
    .line 41
    .line 42
    throw v0
.end method
