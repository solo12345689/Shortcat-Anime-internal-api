.class final Landroidx/compose/foundation/g$a;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LB/k;

.field private b:Z

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(LB/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/g$a;->a:LB/k;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic E1(Landroidx/compose/foundation/g$a;)LB/k;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/g$a;->a:LB/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic F1(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic G1(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic H1(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic I1(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic J1(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic K1(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->b:Z

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public draw(Lu0/c;)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lu0/c;->B1()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->b:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 11
    .line 12
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const/16 v8, 0xe

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const v4, 0x3e99999a    # 0.3f

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    invoke-static/range {v2 .. v9}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v11

    .line 29
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 30
    .line 31
    .line 32
    move-result-wide v15

    .line 33
    const/16 v21, 0x7a

    .line 34
    .line 35
    const/16 v22, 0x0

    .line 36
    .line 37
    const-wide/16 v13, 0x0

    .line 38
    .line 39
    const/16 v17, 0x0

    .line 40
    .line 41
    const/16 v18, 0x0

    .line 42
    .line 43
    const/16 v19, 0x0

    .line 44
    .line 45
    const/16 v20, 0x0

    .line 46
    .line 47
    move-object/from16 v10, p1

    .line 48
    .line 49
    invoke-static/range {v10 .. v22}, Lu0/f;->B0(Lu0/f;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->c:Z

    .line 54
    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->d:Z

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-void

    .line 63
    :cond_2
    :goto_0
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 64
    .line 65
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    const/16 v8, 0xe

    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    const v4, 0x3dcccccd    # 0.1f

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-static/range {v2 .. v9}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v24

    .line 82
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 83
    .line 84
    .line 85
    move-result-wide v28

    .line 86
    const/16 v34, 0x7a

    .line 87
    .line 88
    const/16 v35, 0x0

    .line 89
    .line 90
    const-wide/16 v26, 0x0

    .line 91
    .line 92
    const/16 v30, 0x0

    .line 93
    .line 94
    const/16 v31, 0x0

    .line 95
    .line 96
    const/16 v32, 0x0

    .line 97
    .line 98
    const/16 v33, 0x0

    .line 99
    .line 100
    move-object/from16 v23, p1

    .line 101
    .line 102
    invoke-static/range {v23 .. v35}, Lu0/f;->B0(Lu0/f;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public onAttach()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Landroidx/compose/foundation/g$a$a;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Landroidx/compose/foundation/g$a$a;-><init>(Landroidx/compose/foundation/g$a;LZd/e;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 15
    .line 16
    .line 17
    return-void
.end method
