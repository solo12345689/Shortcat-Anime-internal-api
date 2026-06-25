.class public final synthetic LE3/h1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/S1$d;


# instance fields
.field public final synthetic a:LE3/S1;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LE3/S1;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/h1;->a:LE3/S1;

    .line 5
    .line 6
    iput p2, p0, LE3/h1;->b:I

    .line 7
    .line 8
    iput p3, p0, LE3/h1;->c:I

    .line 9
    .line 10
    iput p4, p0, LE3/h1;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(LE3/r;I)V
    .locals 6

    .line 1
    iget-object v0, p0, LE3/h1;->a:LE3/S1;

    .line 2
    .line 3
    iget v1, p0, LE3/h1;->b:I

    .line 4
    .line 5
    iget v2, p0, LE3/h1;->c:I

    .line 6
    .line 7
    iget v3, p0, LE3/h1;->d:I

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    move v5, p2

    .line 11
    invoke-static/range {v0 .. v5}, LE3/S1;->S1(LE3/S1;IIILE3/r;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
