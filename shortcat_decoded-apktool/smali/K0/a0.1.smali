.class public final LK0/a0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final c:I


# instance fields
.field private final a:La0/c;

.field private final b:Lie/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, La0/c;->d:I

    .line 2
    .line 3
    sput v0, LK0/a0;->c:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(La0/c;Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/a0;->a:La0/c;

    .line 5
    .line 6
    iput-object p2, p0, LK0/a0;->b:Lie/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/a0;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, La0/c;->b(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LK0/a0;->b:Lie/a;

    .line 7
    .line 8
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/a0;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/c;->i()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK0/a0;->b:Lie/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c()La0/c;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/a0;->a:La0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/a0;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/c;->y(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LK0/a0;->b:Lie/a;

    .line 8
    .line 9
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-object p1
.end method
