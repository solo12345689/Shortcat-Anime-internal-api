.class final LJf/z$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LGf/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJf/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:LJf/z;

.field public b:J

.field public final c:Ljava/lang/Object;

.field public final d:LZd/e;


# direct methods
.method public constructor <init>(LJf/z;JLjava/lang/Object;LZd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJf/z$a;->a:LJf/z;

    .line 5
    .line 6
    iput-wide p2, p0, LJf/z$a;->b:J

    .line 7
    .line 8
    iput-object p4, p0, LJf/z$a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p5, p0, LJf/z$a;->d:LZd/e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, LJf/z$a;->a:LJf/z;

    .line 2
    .line 3
    invoke-static {v0, p0}, LJf/z;->n(LJf/z;LJf/z$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
